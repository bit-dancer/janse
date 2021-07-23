import {useIntl} from 'umi';
import {GithubOutlined} from '@ant-design/icons';
import {DefaultFooter} from '@ant-design/pro-layout';

export default () => {
  const intl = useIntl();
  const defaultMessage = intl.formatMessage({
    id: 'app.copyright.produced',
    defaultMessage: '比特舞者开源团队出品',
  });

  return (
    <DefaultFooter
      copyright={`2021 ${defaultMessage}`}
      links={[
        {
          key: 'Github',
          title: <GithubOutlined/>,
          href: 'https://github.com/bit-dancer/janse',
          blankTarget: true,
        }
      ]}
    />
  );
};
